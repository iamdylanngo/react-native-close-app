# React Native Close App
React Native Close App Module is deprecated, you can use module react-native-exit-app: [https://www.npmjs.com/package/react-native-exit-app](https://www.npmjs.com/package/react-native-exit-app)

[Go to NPM](https://www.npmjs.com/package/react-native-close-app)

## Getting started

`$ npm install react-native-close-app --save`
@@ -15,14 +17,19 @@ React Native Close App Module help us close application work on Android, IOS

## iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-close-app` and add `RNCloseApp.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNCloseApp.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<
1. In XCode, in the project navigator, right click
2. `Libraries` ➜ `Add Files to [your project's name]`
3. Go to `node_modules` ➜ `react-native-close-app` 
4. and add `RNCloseApp.xcodeproj`
5. In XCode, in the project navigator, select your project.
6. Add `libRNCloseApp.a` to your project's
7. `Build Phases` ➜ `Link Binary With Libraries`
8. Run your project (`Cmd+R`)<

## Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
1. Open up
2. `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.jundat95.rncloseapp.RNCloseAppPackage;` to the imports at the top of the file
  - Add `new RNCloseAppPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
@@ -32,15 +39,15 @@ React Native Close App Module help us close application work on Android, IOS
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      implementation project(':react-native-close-app')
		implementation project(':react-native-close-app')
  	```


## Usage
```javascript
import RNCloseApp from 'react-native-close-app';
	import RNCloseApp from 'react-native-close-app';
	RNCloseApp.close();
RNCloseApp.close();
```
