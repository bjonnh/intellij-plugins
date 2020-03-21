import com.intellij.testFramework.*
import name.kropp.intellij.makefile.*

class MakefileParserTest : ParsingTestCase("parser", "mk", MakefileParserDefinition()) {
  fun testHelloWorld() = doTest(true)
  fun testVariables() = doTest(true)
  fun testInclude() = doTest(true)
  fun testConditionals() = doTest(true)
  fun testConditionalsInsideRecipe() = doTest(true)
  fun testConditionalVars() = doTest(true)
  fun testConditionalAfterRecipe() = doTest(true)
  fun testPrerequisites() = doTest(true)
  fun testMultipleTargets() = doTest(true)
  fun testDefine() = doTest(true)
  fun testEmptyRecipe() = doTest(true)
  fun testRecipeOnTheSameLine() = doTest(true)
  fun testDirectives() = doTest(true)
  fun testExport() = doTest(true)
  fun testVPath() = doTest(true)
  fun testComments() = doTest(true)
  fun testMultiline() = doTest(true)
  fun testTargetInsideConditional() = doTest(true)
  fun testTargetSpecificVariable() = doTest(true)
  fun testWildcard() = doTest(true)
  fun testDoubleColonRule() = doTest(true)
  fun testStaticPatternRules() = doTest(true)
  fun testDoccomments() = doTest(true)
  fun testFunctions() = doTest(true)
  fun testAtSign() = doTest(true)
  fun testElseif() = doTest(true)
  fun testFunctionInPrerequisites() = doTest(true)
  fun testUndefine() = doTest(true)
  fun testMultilineComment() = doTest(true)
  fun testSimpleVar() = doTest(true)

  fun testIssue7() = doTest(true)
  fun testIssue9() = doTest(true)
  fun testIssue15() = doTest(true)
  fun testIssue23() = doTest(true)
  fun testIssue36() = doTest(true)
  fun testIssue37() = doTest(true)
  fun testIssue44() = doTest(true)
  fun testIssue45() = doTest(true)
  fun testIssue46() = doTest(true)
  fun testIssue56() = doTest(true)
  fun testIssue61() = doTest(true)
  fun testIssue62() = doTest(true)
  fun testIssue63() = doTest(true)
  fun testIssue81() = doTest(true)
  fun testIssue88() = doTest(true)
  fun testIssue91() = doTest(true)
  fun testIssue97() = doTest(true)
  fun testIssue104() = doTest(true)
  fun testIssue107() = doTest(true)
  fun testIssue113() = doTest(true)
  fun testIssue115() = doTest(true)
  fun testIssue116() = doTest(true)
  fun testIssue118() = doTest(true)
  fun testIssue120() = doTest(true)
  fun testIssue130() = doTest(true)
  fun testIssue131() = doTest(true)
  fun testIssue129() = doTest(true)
  fun testIssue132() = doTest(true)
  fun testIssue135() = doTest(true)
  fun testIssue140() = doTest(true)
  fun testIssue141() = doTest(true)
  fun testIssue142() = doTest(true)
  fun testIssue144() = doTest(true)

  override fun getTestDataPath() = "testData"
}