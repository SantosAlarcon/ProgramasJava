/*
 * NewDesktopDesign.fx
 *
 * Created on 18-sep-2010, 23:37:04
 */

package primerprograma;

/**
 * @author FutuzorMekkla
 */
public class NewDesktopDesign {

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:main
    public-read def text: javafx.scene.text.Text = javafx.scene.text.Text {
        disable: false
        opacity: 1.0
        layoutX: 22.0
        layoutY: 45.0
        wrappingWidth: 0.0
        font: null
        content: "Este es mi primer programa con el JavaFX."
    }
    
    public-read def text2: javafx.scene.text.Text = javafx.scene.text.Text {
        layoutX: 22.0
        layoutY: 64.0
        content: "Pulsa en el bot\u00F3n \'Probar\'."
    }
    
    public-read def button: javafx.scene.control.Button = javafx.scene.control.Button {
        layoutX: 217.0
        layoutY: 128.0
        text: "Probar"
        font: javafx.scene.text.Font.DEFAULT
        action: buttonAction
    }
    
    public-read def text3: javafx.scene.text.Text = javafx.scene.text.Text {
        visible: false
        layoutX: 16.0
        layoutY: 190.0
        content: "Text"
    }
    
    def __layoutInfo_separator: javafx.scene.layout.LayoutInfo = javafx.scene.layout.LayoutInfo {
    }
    public-read def separator: javafx.scene.control.Separator = javafx.scene.control.Separator {
        visible: false
        layoutX: 31.0
        layoutY: 281.0
        layoutInfo: __layoutInfo_separator
    }
    
    public-read def scene: javafx.scene.Scene = javafx.scene.Scene {
        width: 480.0
        height: 320.0
        content: getDesignRootNodes ()
        camera: null
        fill: null
    }
    
    public-read def linearGradient: javafx.scene.paint.LinearGradient = javafx.scene.paint.LinearGradient {
        startX: 2.0
        cycleMethod: javafx.scene.paint.CycleMethod.REPEAT
        stops: [ javafx.scene.paint.Stop { offset: 0.0, color: javafx.scene.paint.Color.web ("#FFFFFF") }, javafx.scene.paint.Stop { offset: 1.0, color: javafx.scene.paint.Color.web ("#000000") }, ]
    }
    
    public-read def currentState: org.netbeans.javafx.design.DesignState = org.netbeans.javafx.design.DesignState {
        names: [ "ProbarPulsado", ]
        timelines: [
            javafx.animation.Timeline {
                keyFrames: [
                    javafx.animation.KeyFrame {
                        time: 0ms
                        values: [
                            separator.layoutX => separator.layoutX tween javafx.animation.Interpolator.DISCRETE,
                            __layoutInfo_separator.width => __layoutInfo_separator.width tween javafx.animation.Interpolator.DISCRETE,
                            __layoutInfo_separator.height => __layoutInfo_separator.height tween javafx.animation.Interpolator.DISCRETE,
                        ]
                    }
                    javafx.animation.KeyFrame {
                        time: 92ms
                        values: [
                            separator.layoutX => 0.0 tween javafx.animation.Interpolator.EASEIN,
                            __layoutInfo_separator.width => 480.0 tween javafx.animation.Interpolator.EASEIN,
                            __layoutInfo_separator.height => 13.0 tween javafx.animation.Interpolator.EASEIN,
                        ]
                        action: function() {
                            text3.visible = true;
                            text3.content = "Pepelu";
                            separator.visible = true;
                            scene.camera = null;
                            scene.cursor = null;
                        }
                    }
                ]
            }
        ]
    }
    
    public function getDesignRootNodes (): javafx.scene.Node[] {
        [ text, text2, button, text3, separator, ]
    }
    
    public function getDesignScene (): javafx.scene.Scene {
        scene
    }
    // </editor-fold>//GEN-END:main

    function buttonAction(): Void {
        currentState.actual = currentState.findIndex("ProbarPulsado");
         }

}

function run (): Void {
    var design = NewDesktopDesign {};

    javafx.stage.Stage {
        title: "NewDesktopDesign"
        scene: design.getDesignScene ()
    }
}
