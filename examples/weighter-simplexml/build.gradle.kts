plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.chbase.android.demo.weight"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.chbase.android.demo.weight"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    packagingOptions {
    exclude ("META-INF/DEPENDENCIES")
}
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    api(project(":android-sdk-simplexml"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}