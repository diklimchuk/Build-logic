/**
 * Precompiled [elmslie.detekt.gradle.kts][Elmslie_detekt_gradle] script plugin.
 *
 * @see Elmslie_detekt_gradle
 */
public
class Elmslie_detektPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Elmslie_detekt_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
