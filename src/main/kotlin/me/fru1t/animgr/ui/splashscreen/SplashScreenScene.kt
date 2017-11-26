package me.fru1t.animgr.ui.splashscreen

import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import me.fru1t.animgr.AnimgrApplication

class SplashScreenScene
  : Scene(FXMLLoader.load(AnimgrApplication::class.java.getResource("/scenes/splash_screen.fxml"))) {

}
