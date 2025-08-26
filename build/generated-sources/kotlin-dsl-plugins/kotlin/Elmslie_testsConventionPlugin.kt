/**
 * Precompiled [elmslie.tests-convention.gradle.kts][Elmslie_tests_convention_gradle] script plugin.
 *
 * @see Elmslie_tests_convention_gradle
 */
public
class Elmslie_testsConventionPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Elmslie_tests_convention_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
