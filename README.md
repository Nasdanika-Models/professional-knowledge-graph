# Professional Knowledge Graph

A model/ontology of a professional knowledge graph that allows users to capture detailed information about their professional experience.
It can be used to generate tailored resumes and power professional digital twins.

## Overview

The model is defined as an [Eclipse Modeling Framework (EMF)](https://www.eclipse.org/modeling/emf/) Ecore metamodel at `model/model/professional-knowledge-graph.ecore`.

## Model Elements

### KnowledgeGraph (Root)

The root container of the model. Holds the catalogue of:
* **People** - persons in the graph
* **Skills** - the skill catalogue (hierarchical)
* **Organizations** - employers, clients, institutions
* **Locations** - geographic locations

### Person

A person in the knowledge graph. Captures:
* `name`, `summary` - basic identity
* `contactMethods` - email, phone, web addresses
* `network` - professional network (references to other persons)
* `personSkills` - skills with mastery levels
* `credentials` - education, certifications, training, endorsements, awards, patents
* `efforts` - work history (positions, activities, publications)
* `locations` - where the person has lived/worked

### Skill

A capability or ability. Skills form a **hierarchy** (sub-skills via `skills` containment) and a **graph** (via `relatedSkills` and `prerequisites` cross-references). Skills may have associated `resources` (tools).

### SkillMastery (Enum)

Levels of mastery: `HEARD_OF` → `AWARE` → `FAMILIAR` → `PROFICIENT` → `EXPERT`

### PersonSkill

Associates a skill with a person, recording:
* `mastery` level
* `desired` flag — whether the person wants to improve (false = no plans to improve)
* `notes` — additional context

### Credentials

Abstract base: `Credential` (with `name`, `description`, `date`, `url`, `status`, `skills`)

Concrete types:
| Type | Description |
|---|---|
| `Education` | Degree from an institution (`institution`, `degree`, `fieldOfStudy`, `startDate`, `location`) |
| `Certification` | Professional certification (`issuer`, `credentialId`, `expires`) |
| `TrainingCourse` | Online or in-person course (`provider`, `courseUrl`, `certificateUrl`) |
| `Endorsement` | Skill endorsement by another person (`endorsedBy`, `text`) |
| `Award` | Award or recognition (`issuer`) |
| `Patent` | Invention/patent (`patentNumber`, `inventors`) |

### CredentialStatus (Enum)

`PLANNED` → `IN_PROGRESS` → `OBTAINED` / `ACTIVE` / `EXPIRED`

### Efforts (Work History)

Abstract base: `Effort` (with `name`, `description`, `startDate`, `endDate`, `status`, `skills`, `collaborators`, `plannedRoles`)

Concrete types:
| Type | Description |
|---|---|
| `Position` | A job/role at an organization (`title`, `organization`, `location`, `activities`) |
| `Activity` | A project/assignment within a position or standalone (`outcomes`) |
| `Publication` | An article, paper, book, blog post (`publisher`, `publicationUrl`, `isbn`, `doi`) |

Planned efforts can list `PlannedRole` entries (title, description, required skills, count) for collaboration.

### EffortStatus (Enum)

`IDEA` → `PLANNED` → `IN_PROGRESS` → `COMPLETED` / `ABANDONED`

### Organization

An employer, client, or institution: `name`, `description`, `industry`, `url`, `location`.

### Location

A geographic location: `country`, `state`, `city`.

### ContactMethod (Interface)

Abstract interface with concrete types:
* `Email` — email address
* `Phone` — phone number with country code and extension
* `WebAddress` — URL with platform name (LinkedIn, GitHub, etc.)

## Building

```bash
mvn clean install
```

## Resources

* [Model-Based HR as Code](https://medium.com/nasdanika/model-based-hr-as-code-270f7052c6c5)
* [Resume Models](https://resume.models.nasdanika.org/)
* [Nasdanika Core Capability](https://docs.nasdanika.org/core/capability/index.html)

