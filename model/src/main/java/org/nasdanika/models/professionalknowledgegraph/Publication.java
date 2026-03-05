/**
 */
package org.nasdanika.models.professionalknowledgegraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A publication such as an article, blog post, book, research paper, or other published work.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Publication#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Publication#getPublicationUrl <em>Publication Url</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Publication#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Publication#getDoi <em>Doi</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPublication()
 * @model
 * @generated
 */
public interface Publication extends Effort {
	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Publisher, journal, or platform where this was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' attribute.
	 * @see #setPublisher(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPublication_Publisher()
	 * @model
	 * @generated
	 */
	String getPublisher();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Publication#getPublisher <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' attribute.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(String value);

	/**
	 * Returns the value of the '<em><b>Publication Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL where the publication can be accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Url</em>' attribute.
	 * @see #setPublicationUrl(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPublication_PublicationUrl()
	 * @model
	 * @generated
	 */
	String getPublicationUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Publication#getPublicationUrl <em>Publication Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Url</em>' attribute.
	 * @see #getPublicationUrl()
	 * @generated
	 */
	void setPublicationUrl(String value);

	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISBN for books.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isbn</em>' attribute.
	 * @see #setIsbn(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPublication_Isbn()
	 * @model
	 * @generated
	 */
	String getIsbn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Publication#getIsbn <em>Isbn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isbn</em>' attribute.
	 * @see #getIsbn()
	 * @generated
	 */
	void setIsbn(String value);

	/**
	 * Returns the value of the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Digital Object Identifier for academic papers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi</em>' attribute.
	 * @see #setDoi(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPublication_Doi()
	 * @model
	 * @generated
	 */
	String getDoi();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Publication#getDoi <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi</em>' attribute.
	 * @see #getDoi()
	 * @generated
	 */
	void setDoi(String value);

} // Publication
