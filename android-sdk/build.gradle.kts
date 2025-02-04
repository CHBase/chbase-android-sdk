import org.apache.tools.ant.util.JavaEnvUtils.VERSION_11

plugins {
    id("com.android.library")
}

android {
    namespace = "com.chbase.android"
    compileSdk = 34

    defaultConfig {

        minSdk = 26
        targetSdk = 34
        


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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    api(files("libs/chbase-sdk.jar"))
    implementation(libs.commons.codec)
}