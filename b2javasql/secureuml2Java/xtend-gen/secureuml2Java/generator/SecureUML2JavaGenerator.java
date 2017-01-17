/**
 * generated by Xtext 2.10.0
 */
package secureuml2Java.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import secureuml2Java.secureUML2Java.BMachine;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SecureUML2JavaGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<BMachine> _filter = Iterables.<BMachine>filter(_iterable, BMachine.class);
    for (final BMachine t : _filter) {
      CharSequence _compile = this.compile(t);
      fsa.generateFile("SecureUMLJAVATrans.java", _compile);
    }
  }
  
  public CharSequence compile(final BMachine m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.sql.Connection;");
    _builder.newLine();
    _builder.append("import java.sql.PreparedStatement;");
    _builder.newLine();
    _builder.append("import java.sql.ResultSet;");
    _builder.newLine();
    _builder.append("import java.sql.SQLException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class SecureUMLJAVATrans {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String connectingUser;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String currentRole;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Connection dbcon;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void connectUser(String usr, String  rol) ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("connectingUser = usr;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("currentRole = rol;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String checkUserPermission(String usr, String op) throws SQLException ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String access = \"denied\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//getting the connecting user,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//making sure that the verified user is currently ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//connecting to the system.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String conUser = getConnectingUser();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (usr.equals(conUser)) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//checking the permission based on the current role of the user,");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//the execution is granted if the method isPermittedRole()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// returns true, denied otherwise.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("boolean isPermitted = isPermittedRole(currentRole, op);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (isPermitted)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("access = \"granted\";");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("else");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("access = \"denied\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return access;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//checking the execution permission of a given role on a given method\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean isPermittedRole(String rol, String op) throws SQLException ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("boolean access = false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//defining a PreparedStatement JAVA variable to verify ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//permission of a given role on executing a given stored procedure");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("PreparedStatement stm = dbcon.prepareStatement(\"SELECT COUNT(*)\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("+ \"FROM sys.database_permissions \"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("+ \"WHERE USER_NAME(grantee_principal_id) = (?) \"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("+ \"AND OBJECT_NAME(major_id) = (?) \"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("+ \"AND permission_name = \'EXECUTE\';\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("stm.setString(1, rol);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("stm.setString(2, op);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//the execution of the statement,");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//returns true if there exists at least one row in the database,");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//returns false otherwise.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ResultSet resSet = stm.executeQuery();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (resSet.next() && resSet.getInt(1) > 0)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("access = true;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resSet.close();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch (SQLException e) {e.printStackTrace();}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return access;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String getConnectingUser() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return connectingUser;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}