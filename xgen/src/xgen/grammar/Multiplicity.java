/**
 */
package xgen.grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xgen.grammar.Multiplicity#getMin <em>Min</em>}</li>
 *   <li>{@link xgen.grammar.Multiplicity#getMax <em>Max</em>}</li>
 *   <li>{@link xgen.grammar.Multiplicity#isUpperBounded <em>Upper Bounded</em>}</li>
 * </ul>
 * </p>
 *
 * @see xgen.grammar.GrammarPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends Suffix {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see xgen.grammar.GrammarPackage#getMultiplicity_Min()
	 * @model unique="false"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link xgen.grammar.Multiplicity#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see xgen.grammar.GrammarPackage#getMultiplicity_Max()
	 * @model unique="false"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link xgen.grammar.Multiplicity#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bounded</em>' attribute.
	 * @see #setUpperBounded(boolean)
	 * @see xgen.grammar.GrammarPackage#getMultiplicity_UpperBounded()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUpperBounded();

	/**
	 * Sets the value of the '{@link xgen.grammar.Multiplicity#isUpperBounded <em>Upper Bounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bounded</em>' attribute.
	 * @see #isUpperBounded()
	 * @generated
	 */
	void setUpperBounded(boolean value);

} // Multiplicity
