package Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dsalamanca.movil.MovilPage1
import com.dsalamanca.movil.MovilPage2
import com.dsalamanca.movil.MovilPage3
import com.dsalamanca.movil.MovilPage4
import com.dsalamanca.movil.MovilPage5
import com.dsalamanca.movil.MovilPage6

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.Page1.route){
        composable(route = AppScreens.Page1.route){
            MovilPage1(navController)
        }
        composable(route = AppScreens.Page2.route){
            MovilPage2(navController)
        }
        composable(route = AppScreens.Page3.route){
            MovilPage3(navController)
        }
        composable(route = AppScreens.Page4.route){
            MovilPage4(navController)
        }
        composable(route = AppScreens.Page5.route){
            MovilPage5(navController)
        }
        composable(route = AppScreens.Page6.route){
            MovilPage6(navController)
        }
    }

}