/**
 * generated by Xtext 2.10.0
 */
package bsqllog2java.bSQLLog2Java;

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
 *   <li>{@link bsqllog2java.bSQLLog2Java.BOperation#getBops <em>Bops</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.BOperation#getVops <em>Vops</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.BOperation#getSops <em>Sops</em>}</li>
 * </ul>
 *
 * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getBOperation()
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
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getBOperation_Bops()
   * @model containment="true"
   * @generated
   */
  BoolOperation getBops();

  /**
   * Sets the value of the '{@link bsqllog2java.bSQLLog2Java.BOperation#getBops <em>Bops</em>}' containment reference.
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
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getBOperation_Vops()
   * @model containment="true"
   * @generated
   */
  VoidOperation getVops();

  /**
   * Sets the value of the '{@link bsqllog2java.bSQLLog2Java.BOperation#getVops <em>Vops</em>}' containment reference.
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
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getBOperation_Sops()
   * @model containment="true"
   * @generated
   */
  StringOperation getSops();

  /**
   * Sets the value of the '{@link bsqllog2java.bSQLLog2Java.BOperation#getSops <em>Sops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sops</em>' containment reference.
   * @see #getSops()
   * @generated
   */
  void setSops(StringOperation value);

} // BOperation