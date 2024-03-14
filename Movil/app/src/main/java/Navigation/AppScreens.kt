package Navigation

sealed class AppScreens(val route: String){
    object Page1: AppScreens("MovilPage1")
    object Page2: AppScreens("MovilPage2")

    object Page3: AppScreens("MovilPage3")
    object Page4: AppScreens("MovilPage4")
    object Page5: AppScreens("MovilPage5")
    object Page6: AppScreens("MovilPage6")
}
