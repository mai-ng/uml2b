/*
 * generated by Xtext 2.10.0
 */
package bsql2sql.serializer;

import bsql2sql.bSQL2SQL.Attribute;
import bsql2sql.bSQL2SQL.BParameter;
import bsql2sql.bSQL2SQL.BPredicate;
import bsql2sql.bSQL2SQL.BSOperation;
import bsql2sql.bSQL2SQL.BSQL2SQLPackage;
import bsql2sql.bSQL2SQL.BSQLMachine;
import bsql2sql.bSQL2SQL.BSubstitution;
import bsql2sql.bSQL2SQL.BTable;
import bsql2sql.bSQL2SQL.BType;
import bsql2sql.bSQL2SQL.BoolOperation;
import bsql2sql.bSQL2SQL.SQLCall;
import bsql2sql.bSQL2SQL.TIAssignment;
import bsql2sql.bSQL2SQL.TableInstance;
import bsql2sql.bSQL2SQL.VoidOperation;
import bsql2sql.services.BSQL2SQLGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BSQL2SQLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BSQL2SQLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BSQL2SQLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BSQL2SQLPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case BSQL2SQLPackage.BPARAMETER:
				sequence_BParameter(context, (BParameter) semanticObject); 
				return; 
			case BSQL2SQLPackage.BPREDICATE:
				sequence_BPredicate(context, (BPredicate) semanticObject); 
				return; 
			case BSQL2SQLPackage.BS_OPERATION:
				sequence_BSOperation(context, (BSOperation) semanticObject); 
				return; 
			case BSQL2SQLPackage.BSQL_MACHINE:
				sequence_BSQLMachine(context, (BSQLMachine) semanticObject); 
				return; 
			case BSQL2SQLPackage.BSUBSTITUTION:
				sequence_BSubstitution(context, (BSubstitution) semanticObject); 
				return; 
			case BSQL2SQLPackage.BTABLE:
				sequence_BTable(context, (BTable) semanticObject); 
				return; 
			case BSQL2SQLPackage.BTYPE:
				sequence_BType(context, (BType) semanticObject); 
				return; 
			case BSQL2SQLPackage.BOOL_OPERATION:
				sequence_BoolOperation(context, (BoolOperation) semanticObject); 
				return; 
			case BSQL2SQLPackage.SQL_CALL:
				sequence_SQLCall(context, (SQLCall) semanticObject); 
				return; 
			case BSQL2SQLPackage.TI_ASSIGNMENT:
				sequence_TIAssignment(context, (TIAssignment) semanticObject); 
				return; 
			case BSQL2SQLPackage.TABLE_INSTANCE:
				sequence_TableInstance(context, (TableInstance) semanticObject); 
				return; 
			case BSQL2SQLPackage.VOID_OPERATION:
				sequence_VoidOperation(context, (VoidOperation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (att_name=ID type=BType)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.ATTRIBUTE__ATT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.ATTRIBUTE__ATT_NAME));
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.ATTRIBUTE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getAtt_nameIDTerminalRuleCall_0_0(), semanticObject.getAtt_name());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeBTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BParameter returns BParameter
	 *
	 * Constraint:
	 *     (p_name=ID type=BType)
	 */
	protected void sequence_BParameter(ISerializationContext context, BParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.BPARAMETER__PNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.BPARAMETER__PNAME));
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.BPARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.BPARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBParameterAccess().getP_nameIDTerminalRuleCall_0_0(), semanticObject.getP_name());
		feeder.accept(grammarAccess.getBParameterAccess().getTypeBTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BPredicate returns BPredicate
	 *
	 * Constraint:
	 *     (PLeft=SQLCall PRight=BValue)
	 */
	protected void sequence_BPredicate(ISerializationContext context, BPredicate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.BPREDICATE__PLEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.BPREDICATE__PLEFT));
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.BPREDICATE__PRIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.BPREDICATE__PRIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBPredicateAccess().getPLeftSQLCallParserRuleCall_1_0_0(), semanticObject.getPLeft());
		feeder.accept(grammarAccess.getBPredicateAccess().getPRightBValueParserRuleCall_1_2_0(), semanticObject.getPRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BSOperation returns BSOperation
	 *
	 * Constraint:
	 *     (bop=BoolOperation | vop=VoidOperation)
	 */
	protected void sequence_BSOperation(ISerializationContext context, BSOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BSQL2SQL returns BSQLMachine
	 *     BSQLMachine returns BSQLMachine
	 *
	 * Constraint:
	 *     (m_name=ID vars=ID inv=BTable init=ID ops+=BSOperation+)
	 */
	protected void sequence_BSQLMachine(ISerializationContext context, BSQLMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BSubstitution returns BSubstitution
	 *
	 * Constraint:
	 *     (left=ID right=BPredicate)
	 */
	protected void sequence_BSubstitution(ISerializationContext context, BSubstitution semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.BSUBSTITUTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.BSUBSTITUTION__LEFT));
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.BSUBSTITUTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.BSUBSTITUTION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBSubstitutionAccess().getLeftIDTerminalRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBSubstitutionAccess().getRightBPredicateParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BTable returns BTable
	 *
	 * Constraint:
	 *     (table_name=ID attributes+=Attribute attributes+=Attribute*)
	 */
	protected void sequence_BTable(ISerializationContext context, BTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BType returns BType
	 *
	 * Constraint:
	 *     type_name=ID
	 */
	protected void sequence_BType(ISerializationContext context, BType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.BTYPE__TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.BTYPE__TYPE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBTypeAccess().getType_nameIDTerminalRuleCall_0(), semanticObject.getType_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BoolOperation returns BoolOperation
	 *
	 * Constraint:
	 *     (
	 *         op_name=ID 
	 *         (pList+=ID pList+=ID*)? 
	 *         params+=BParameter 
	 *         params+=BParameter* 
	 *         objTable=TableInstance 
	 *         pres+=BPredicate 
	 *         pres+=BPredicate*
	 *     )
	 */
	protected void sequence_BoolOperation(ISerializationContext context, BoolOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SQLCall returns SQLCall
	 *
	 * Constraint:
	 *     (SLeft=ID SRight=ID)
	 */
	protected void sequence_SQLCall(ISerializationContext context, SQLCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.SQL_CALL__SLEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.SQL_CALL__SLEFT));
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.SQL_CALL__SRIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.SQL_CALL__SRIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSQLCallAccess().getSLeftIDTerminalRuleCall_0_0(), semanticObject.getSLeft());
		feeder.accept(grammarAccess.getSQLCallAccess().getSRightIDTerminalRuleCall_2_0(), semanticObject.getSRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TIAssignment returns TIAssignment
	 *
	 * Constraint:
	 *     (instance_name=ID instance_type=ID)
	 */
	protected void sequence_TIAssignment(ISerializationContext context, TIAssignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.TI_ASSIGNMENT__INSTANCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.TI_ASSIGNMENT__INSTANCE_NAME));
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.TI_ASSIGNMENT__INSTANCE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.TI_ASSIGNMENT__INSTANCE_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTIAssignmentAccess().getInstance_nameIDTerminalRuleCall_0_0(), semanticObject.getInstance_name());
		feeder.accept(grammarAccess.getTIAssignmentAccess().getInstance_typeIDTerminalRuleCall_2_0(), semanticObject.getInstance_type());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TableInstance returns TableInstance
	 *
	 * Constraint:
	 *     (ti_name=ID ti_type=TIAssignment)
	 */
	protected void sequence_TableInstance(ISerializationContext context, TableInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.TABLE_INSTANCE__TI_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.TABLE_INSTANCE__TI_NAME));
			if (transientValues.isValueTransient(semanticObject, BSQL2SQLPackage.Literals.TABLE_INSTANCE__TI_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSQL2SQLPackage.Literals.TABLE_INSTANCE__TI_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTableInstanceAccess().getTi_nameIDTerminalRuleCall_0_0(), semanticObject.getTi_name());
		feeder.accept(grammarAccess.getTableInstanceAccess().getTi_typeTIAssignmentParserRuleCall_2_0(), semanticObject.getTi_type());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VoidOperation returns VoidOperation
	 *
	 * Constraint:
	 *     (op_name=ID (pList+=ID pList+=ID*)? params+=BParameter params+=BParameter* subs+=BSubstitution*)
	 */
	protected void sequence_VoidOperation(ISerializationContext context, VoidOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}