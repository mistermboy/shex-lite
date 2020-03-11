package compiler.ast

import compiler.ast.statements.Statement

private[compiler] class Schema(filename: String, line: Int, column: Int, val statements: List[Statement])
  extends ASTNode(filename, line, column) {

  /**
   * Helper method for the ast walkers.
   *
   * @param walker to walk over the AST node.
   * @tparam TP is the type of the parameter.
   * @tparam TR is the type of the return object.
   * @return an object o
   */
  override def walk[TP, TR](walker: ASTWalker[TP, TR], param: TP): TR = {
    walker.walk(this, param)
  }
}
