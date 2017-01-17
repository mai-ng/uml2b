/**
 * generated by Xtext 2.10.0
 */
package b2sql.b2SQL2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link b2sql.b2SQL2.BOperation#getBops <em>Bops</em>}</li>
 *   <li>{@link b2sql.b2SQL2.BOperation#getVops <em>Vops</em>}</li>
 *   <li>{@link b2sql.b2SQL2.BOperation#getSops <em>Sops</em>}</li>
 * </ul>
 *
 * @see b2sql.b2SQL2.B2SQL2Package#getBOperation()
 * @model
 * @generated
 */
public interface BOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Bops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bops</em>' containment reference.
   * @see #setBops(BoolOperation)
   * @see b2sql.b2SQL2.B2SQL2Package#getBOperation_Bops()
   * @model containment="true"
   * @generated
   */
  BoolOperation getBops();

  /**
   * Sets the value of the '{@link b2sql.b2SQL2.BOperation#getBops <em>Bops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bops</em>' containment reference.
   * @see #getBops()
   * @generated
   */
  void setBops(BoolOperation value);

  /**
   * Returns the value of the '<em><b>Vops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vops</em>' containment reference.
   * @see #setVops(VoidOperation)
   * @see b2sql.b2SQL2.B2SQL2Package#getBOperation_Vops()
   * @model containment="true"
   * @generated
   */
  VoidOperation getVops();

  /**
   * Sets the value of the '{@link b2sql.b2SQL2.BOperation#getVops <em>Vops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vops</em>' containment reference.
   * @see #getVops()
   * @generated
   */
  void setVops(VoidOperation value);

  /**
   * Returns the value of the '<em><b>Sops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sops</em>' containment reference.
   * @see #setSops(StringOperation)
   * @see b2sql.b2SQL2.B2SQL2Package#getBOperation_Sops()
   * @model containment="true"
   * @generated
   */
  StringOperation getSops();

  /**
   * Sets the value of the '{@link b2sql.b2SQL2.BOperation#getSops <em>Sops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sops</em>' containment reference.
   * @see #getSops()
   * @generated
   */
  void setSops(StringOperation value);

} // BOperation