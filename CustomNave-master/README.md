
# CustomNave
 ## CustomNave is a library designed for implementing bubble bottom navigation in Android applications. It simplifies the process of adding a customizable bottom navigation bar to your Android project.

# Installation
## To use CustomNave in your project, add the following dependency to your build.gradle file:
```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven ( url ="https://jitpack.io")
    }
}
```
```
dependencies {
    implementation ("com.github.yusufkhan08070817:CustomNave:1.0.3")
}
```
# Usage
### Initialization
### To initialize CustomNave in your application, you need to perform the following steps:

# Create a Cnave object:
```
Cnave(this)
Nave.getInstance(this.applicationContext)
```
# Adding Layout
### To add the bottom navigation layout to your XML layout, follow these steps:

### Ensure you have a RelativeLayout in your layout where you want to add the bottom navigation.
# Add the bottom navigation using the Nave.add() method:
```
Nave.add(binding.mainlay)
```
# Customization
You can customize the bottom navigation by adding images or performing actions on click:

To set an image for a specific item in the bottom navigation:
```
naveobj.naveobj.imageButton1.setImageResource(R.drawable.ic_launcher_background)
```

# To handle click events and perform actions based on the selected item:
```
state.state.observe(this, { t ->
    when (t) {
        1 -> { naveobj.naveobj.imageButton1.setImageResource(R.drawable.learn) }
        2 -> { }
        3 -> { startActivity(Intent(this, MainActivity2::class.java)) }
        4 -> { }
        5 -> { }
    }
})
```

# Note: There are only 5 items in the navigation.

Ensure you repeat these steps in all activities where you want to incorporate this navigation.

# License
This project is licensed under the MIT License - see the LICENSE file for details.

# Feel free to contribute to the project or report any issues you encounter. Happy coding! 🚀
