package es.weso.compiler.parser.ast

import es.weso.shexl.compiler.parser.ast.{ASTNode, StatementDeclaration}

/**
 *
 */
private[compiler] trait Invocation[T <: StatementDeclaration] extends ASTNode {

  /**
   * Gets the associated declaration.
   *
   * @return the original declaration.
   */
  def getDeclaration(): T

  /**
   * Sets the declaration value.
   *
   * @param declaration to be set as the original declaration.
   */
  def setDeclaration(declaration: T)
}
