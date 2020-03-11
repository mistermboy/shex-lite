package compiler.ast.expressions.constraints
import compiler.ast.ASTWalker

private[compiler] class ValueSetConstraint(filename: String, line: Int, column: Int, values: List[ValueSetValidType])
  extends Constraint(filename, line, column) {

  /**
   * Helper method for the ast walkers.
   *
   * @param walker to walk over the AST node.
   * @tparam TP is the type of the parameter.
   * @tparam TR is the type of the return object.
   * @return an object o
   */
  override def walk[TP, TR](walker: ASTWalker[TP, TR], param: TP): TR = ???
}
