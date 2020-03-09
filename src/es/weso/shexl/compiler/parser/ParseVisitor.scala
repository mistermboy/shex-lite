package es.weso.shexl.compiler.parser

import es.weso.compiler.parser.generated.{ShexlBaseVisitor, ShexlParser}

class ParseVisitor extends  ShexlBaseVisitor[Any] {

  override def visitSchema(ctx: ShexlParser.SchemaContext): T = visitChildren(ctx)

  override def visitStatement(ctx: ShexlParser.StatementContext): T = visitChildren(ctx)

  override def visitDeclaration_statement(ctx: ShexlParser.Declaration_statementContext): T = visitChildren(ctx)

  override def visitBase_declaration(ctx: ShexlParser.Base_declarationContext): T = visitChildren(ctx)

  override def visitStart_declaration(ctx: ShexlParser.Start_declarationContext): T = visitChildren(ctx)

  override def visitPrefix_declaration(ctx: ShexlParser.Prefix_declarationContext): T = visitChildren(ctx)

  override def visitShape_declaration(ctx: ShexlParser.Shape_declarationContext): T = visitChildren(ctx)

  override def visitImport_statement(ctx: ShexlParser.Import_statementContext): T = visitChildren(ctx)

  override def visitShape_name(ctx: ShexlParser.Shape_nameContext): T = visitChildren(ctx)

  override def visitShape_invocation(ctx: ShexlParser.Shape_invocationContext): T = visitChildren(ctx)

  override def visitExpression(ctx: ShexlParser.ExpressionContext): T = visitChildren(ctx)

  override def visitTriple_expression(ctx: ShexlParser.Triple_expressionContext): T = visitChildren(ctx)

  override def visitTriple_constraint(ctx: ShexlParser.Triple_constraintContext): T = visitChildren(ctx)

  override def visitPrefix_invocation(ctx: ShexlParser.Prefix_invocationContext): T = visitChildren(ctx)

  override def visitNode_constraint(ctx: ShexlParser.Node_constraintContext): T = visitChildren(ctx)

  override def visitValue_set_type(ctx: ShexlParser.Value_set_typeContext): T = visitChildren(ctx)

  override def visitCardinality(ctx: ShexlParser.CardinalityContext): T = visitChildren(ctx)

}
