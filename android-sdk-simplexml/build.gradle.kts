plugins {
    id("com.android.library")
}

android {
    namespace = "com.chbase.android.simplexml"
    compileSdk = 34

    defaultConfig {

        minSdk = 24
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    api(files("libs/chbase-sdk.jar"))
    implementation("org.simpleframework:simple-xml:2.7.1")
    implementation("commons-codec:commons-codec:1.9")
}