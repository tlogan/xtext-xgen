/**
 */
package xgen.grammar.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import xgen.grammar.Alternative;
import xgen.grammar.Any;
import xgen.grammar.Construct;
import xgen.grammar.Definition;
import xgen.grammar.Element;
import xgen.grammar.Grammar;
import xgen.grammar.GrammarPackage;
import xgen.grammar.Keyword;
import xgen.grammar.Multiplicity;
import xgen.grammar.NAry;
import xgen.grammar.Not;
import xgen.grammar.Placeholder;
import xgen.grammar.Prefix;
import xgen.grammar.Range;
import xgen.grammar.Reference;
import xgen.grammar.Sequence;
import xgen.grammar.Suffix;
import xgen.grammar.Terminal;
import xgen.grammar.Unary;
import xgen.grammar.Until;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see xgen.grammar.GrammarPackage
 * @generated
 */
public class GrammarSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrammarPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarSwitch() {
		if (modelPackage == null)
		{
			modelPackage = GrammarPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID)
		{
			case GrammarPackage.GRAMMAR:
			{
				Grammar grammar = (Grammar)theEObject;
				T result = caseGrammar(grammar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.ELEMENT:
			{
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.DEFINITION:
			{
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = caseElement(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.CONSTRUCT:
			{
				Construct construct = (Construct)theEObject;
				T result = caseConstruct(construct);
				if (result == null) result = caseElement(construct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.TERMINAL:
			{
				Terminal terminal = (Terminal)theEObject;
				T result = caseTerminal(terminal);
				if (result == null) result = caseConstruct(terminal);
				if (result == null) result = caseElement(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.UNARY:
			{
				Unary unary = (Unary)theEObject;
				T result = caseUnary(unary);
				if (result == null) result = caseConstruct(unary);
				if (result == null) result = caseElement(unary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.PREFIX:
			{
				Prefix prefix = (Prefix)theEObject;
				T result = casePrefix(prefix);
				if (result == null) result = caseUnary(prefix);
				if (result == null) result = caseConstruct(prefix);
				if (result == null) result = caseElement(prefix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.SUFFIX:
			{
				Suffix suffix = (Suffix)theEObject;
				T result = caseSuffix(suffix);
				if (result == null) result = caseUnary(suffix);
				if (result == null) result = caseConstruct(suffix);
				if (result == null) result = caseElement(suffix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.NARY:
			{
				NAry nAry = (NAry)theEObject;
				T result = caseNAry(nAry);
				if (result == null) result = caseConstruct(nAry);
				if (result == null) result = caseElement(nAry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.ANY:
			{
				Any any = (Any)theEObject;
				T result = caseAny(any);
				if (result == null) result = caseTerminal(any);
				if (result == null) result = caseConstruct(any);
				if (result == null) result = caseElement(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.KEYWORD:
			{
				Keyword keyword = (Keyword)theEObject;
				T result = caseKeyword(keyword);
				if (result == null) result = caseTerminal(keyword);
				if (result == null) result = caseConstruct(keyword);
				if (result == null) result = caseElement(keyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.RANGE:
			{
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseTerminal(range);
				if (result == null) result = caseConstruct(range);
				if (result == null) result = caseElement(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.REFERENCE:
			{
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseTerminal(reference);
				if (result == null) result = caseConstruct(reference);
				if (result == null) result = caseElement(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.PLACEHOLDER:
			{
				Placeholder placeholder = (Placeholder)theEObject;
				T result = casePlaceholder(placeholder);
				if (result == null) result = caseTerminal(placeholder);
				if (result == null) result = caseConstruct(placeholder);
				if (result == null) result = caseElement(placeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.NOT:
			{
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = casePrefix(not);
				if (result == null) result = caseUnary(not);
				if (result == null) result = caseConstruct(not);
				if (result == null) result = caseElement(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.UNTIL:
			{
				Until until = (Until)theEObject;
				T result = caseUntil(until);
				if (result == null) result = casePrefix(until);
				if (result == null) result = caseUnary(until);
				if (result == null) result = caseConstruct(until);
				if (result == null) result = caseElement(until);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.MULTIPLICITY:
			{
				Multiplicity multiplicity = (Multiplicity)theEObject;
				T result = caseMultiplicity(multiplicity);
				if (result == null) result = caseSuffix(multiplicity);
				if (result == null) result = caseUnary(multiplicity);
				if (result == null) result = caseConstruct(multiplicity);
				if (result == null) result = caseElement(multiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.ALTERNATIVE:
			{
				Alternative alternative = (Alternative)theEObject;
				T result = caseAlternative(alternative);
				if (result == null) result = caseNAry(alternative);
				if (result == null) result = caseConstruct(alternative);
				if (result == null) result = caseElement(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.SEQUENCE:
			{
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseNAry(sequence);
				if (result == null) result = caseConstruct(sequence);
				if (result == null) result = caseElement(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grammar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrammar(Grammar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstruct(Construct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnary(Unary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNAry(NAry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAny(Any object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyword(Keyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicity(Multiplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Until</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntil(Until object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholder(Placeholder object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefix(Prefix object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suffix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suffix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuffix(Suffix object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GrammarSwitch
