plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.innovattic.badge")
}

android {
    compileSdk = 30
}

badge {
    iconNames = listOf("@mipmap/ic_lib_launcher")
    buildTypes {
        create("debug") {
            enabled = true
            text = "Something"
        }
    }
}

dependencies {
}
