import com.soywiz.klock.seconds
import com.soywiz.klogger.AnsiEscape
import com.soywiz.korge.*
import com.soywiz.korge.input.onClick
import com.soywiz.korge.scene.Module
import com.soywiz.korge.scene.Scene
import com.soywiz.korge.tween.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.Colors
import com.soywiz.korim.format.*
import com.soywiz.korinject.AsyncInjector
import com.soywiz.korio.file.std.*
import com.soywiz.korma.geom.SizeInt
import com.soywiz.korma.geom.degrees
import com.soywiz.korma.interpolation.Easing
import kotlin.reflect.KClass

suspend fun main() = Korge(Korge.Config(module = configModule))
    object configModule:Module(){
        override val size: SizeInt = SizeInt(512,512)
        override val bgcolor = Colors["#16281f"]
        override val mainScene: KClass<Scene1> = Scene1::class
        override suspend fun AsyncInjector.configure(){
            mapPrototype { Scene1() }
            mapPrototype { Scene2() }
        }
    }




class Scene1(): Scene() {
    override suspend fun Container.sceneInit(){
        val circle = circle(25.0, fill = Colors.DARKRED).xy(100,200)
        circle.onClick {
            sceneContainer.changeTo<Scene2>()
        }
    }
}

class Scene2(): Scene() {
    override suspend fun Container.sceneInit(){
        val circle = circle(35.0, fill = Colors.ALICEBLUE).xy(200,100)
        circle.onClick {
            sceneContainer.changeTo<Scene1>()
        }
    }
}