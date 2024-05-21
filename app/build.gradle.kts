plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.ahmetserhatfidan.mobilprogramlamahw_3"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ahmetserhatfidan.mobilprogramlamahw_3"
        minSdk = 24
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    dependencies {
        implementation 'com.squareup.retrofit2:retrofit:2.9.0'
        implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
        implementation 'com.github.bumptech.glide:glide:4.12.0'
        annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'

        implementation "androidx.recyclerview:recyclerview:1.2.1"
        implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.3.1"
        implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
        implementation "androidx.databinding:viewbinding:4.1.3"
    }

}