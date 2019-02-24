
# React Native Close App
React Native Close App Module help us close application work on Android, IOS

[Go to NPM](https://www.npmjs.com/package/react-native-close-app)

## Getting started

`$ npm install react-native-close-app --save`

## Mostly automatic installation

`$ react-native link react-native-close-app`

## Manual installation


## iOS

1. In XCode, in the project navigator, right click
2. `Libraries` ➜ `Add Files to [your project's name]`
3. Go to `node_modules` ➜ `react-native-close-app` 
4. and add `RNCloseApp.xcodeproj`
5. In XCode, in the project navigator, select your project.
6. Add `libRNCloseApp.a` to your project's
7. `Build Phases` ➜ `Link Binary With Libraries`
8. Run your project (`Cmd+R`)<

## Android

1. Open up
2. `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.jundat95.rncloseapp.RNCloseAppPackage;` to the imports at the top of the file
  - Add `new RNCloseAppPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-close-app'
  	project(':react-native-close-app').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-close-app/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
		implementation project(':react-native-close-app')
  	```


## Usage
```javascript

	import RNCloseApp from 'react-native-close-app';

	RNCloseApp.close();

```
