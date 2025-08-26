/**
 * Precompiled [elmslie.base-lib.gradle.kts][Elmslie_base_lib_gradle] script plugin.
 *
 * @see Elmslie_base_lib_gradle
 */
public
class Elmslie_baseLibPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Elmslie_base_lib_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
