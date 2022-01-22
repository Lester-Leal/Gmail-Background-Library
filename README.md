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
