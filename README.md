# Gmail Background Library for Android Studio
a small library to send a email in background without user interaction.

This Library was originally made by **Yesid Lazaro** <a href="https://github.com/yesidlazaro/GmailBackground">LINK</a>

<p>Under Licensed to <b>the Apache Software Foundation (ASF)</b> <a href="http://www.apache.org/licenses/LICENSE-2.0">http://www.apache.org/licenses/LICENSE-2.0</a></p> 

# Guidlines Installations

<b>Project - build.gradle(app)</b>
<p>For External Use <b>implementation project</b></p>

```kotlin
dependencies {
    implementation project(':gmailbackgroundlibrary')
}
```
<b>Project - settings.gradle</b>
```kotlin
include ':app', ':gmailbackgroundlibrary'
```
**Gradle via Jetpack**
```groovy
 repositories {
        maven { url "https://jitpack.io" }
 }
```
**AndroidManifist (Android Permissions)**
```xml
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
<uses-permission android:name="android.permission.INTERNET"/>
```
 To able to use attachment you need set READ_EXTERNAL_STORAGE permission in your manifiest
 ```xml
 <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
```
**Proguard**
```
-keep class org.apache.** { *; }
-dontwarn org.apache.**

-keep class com.sun.mail.** { *; }
-dontwarn com.sun.mail.**

-keep class java.beans.** { *; }
-dontwarn java.beans.**
```
# Method Functions

| Functions | Description |
| --- | --- |
| `setUsername` | Set Sender Username (@String/int) |
| `setPassword` | Set Sender Password (@String/int) |
| `setSenderName` | Set Sender Name (@String) |
| `setMailTo` | Set Mail to specific Email Address (@String/int) |
| `setMailCc` | Set Mail CC (@String/int) |
| `setMailBcc` | Set Mail BCC (@String/int) |
| `setSubject` | Set Mail Subjects (@String/int) |
| `setBody`  | Set Mail Body (@String/int) |
| `setType`  | Set Email Type can be Plain or HTML Style (@String/int) |
| `setAttachments`  | Set Email Type can be Plain or HTML Style (@Arraylist/String)|
| `setSendingMessage`  | Set Mail Sending Message (@String/int)|

# Functions Callbacks

| Callbacks | Description |
| --- | --- |
| `OnSendingMessageSuccess` | If setSendingMessage was Success sent |
| `OnSendingMessageError` | If setSendingMessage was Failed or Something went wrong |
| `setProcessVisibility` | Set Process (true/false) |
| `OnSuccessCallback` | If Mail was Succesfully Sent to MailTo |
| `OnFailCallback` | If Mail was Failed to sent |

# Library Update Logs

-------------------------------------------------------------------------------------------------------------------------------
```
This Library is already refactored to AndroidX

Project Gradle 2.14.1 - Upgraded to Gradle Wrapper 3.0 REFERENCE: https://services.gradle.org/distributions/gradle-3.0-bin.zip
After Upgraded to Wrapper 3.0 - Updated to Gradle Wrapper 4.8 due to incompatible with Java 11 or newer

Android Gradle Plugin Version: 7.0.0 Nougat
Gradle Version: 7.3.3
minSdkVersion: 11 - minSdkVersion: 14

**BUILD GRADLE APP**
targetSdkVersion: 25 - targetSdkVersion: 31
compileSdkVersion: 25 - compileSdkVersion: 31
buildToolsVersion "25.0.1" - buildToolsVersion "25.0.3"

**LIST OF DEPENDENCIES THAT BEING UPDATED TO LATEST LIBRARIES & ADDED NEW LIBRARIES**
junit:junit:4.12 - junit:junit:4.13.2
androidx.appcompat:appcompat:1.0.0 - androidx.appcompat:appcompat:1.4.1
com.google.android.material:material:1.0.0 - com.google.android.material:material:1.5.0
androidx.annotation:annotation:1.0.0 - androidx.annotation:annotation:1.3.0

**REQUIRED INSTRUMENTED TEST**
androidTestImplementation 'androidx.test.ext:junit:1.1.3'
androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
androidTestImplementation 'com.android.support.test:rules:1.0.2'
androidTestImplementation 'com.android.support.test:runner:1.0.2'

**LIBRARY UTIL UPDATES**
UTF8 Changed to StandardCharsets.UTF_8 can be used instead
Cipher.getInstance should not be called without setting the encryption mode and padding 
Cipher cipher = Cipher.getInstance("DES"); - Suppressed  @SuppressLint("GetInstance") Cipher cipher = Cipher.getInstance("DES");
```
-------------------------------------------------------------------------------------------------------------------------------
