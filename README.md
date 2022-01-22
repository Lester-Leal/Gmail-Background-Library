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
# Usages

```kotlin
        BackgroundMail.newBuilder(this)
                .setUsername("username@gmail.com")
                .setPassword("password12345")
                .setSenderName("SenderName")
                .setMailTo("testemail@gmail.com")
                .setMailCc("john.doe@gmail.com, jane.doe@gmail.com")
                .setSubject("this is the subject")
                .setBody("this is the body")
                .OnSuccessCallback(new BackgroundMail.OnSuccessCallback() {
                    @Override
                    public void onSuccess() {
                        //do some magic
                    }
                })
                .OnFailCallback(new BackgroundMail.OnFailCallback() {
                    @Override
                    public void onFail() {
                        //do some magic
                    }
                })
                .send();
```
