# RN-lib-demo

## Getting started

`$ npm install RN-lib-demo --save`

### Mostly automatic installation

`$ react-native link RN-lib-demo`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `RN-lib-demo` and add `RNLibDemo.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNLibDemo.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.codemobiles.rnlibdemo.RNLibDemoPackage;` to the imports at the top of the file
  - Add `new RNLibDemoPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':RN-lib-demo'
  	project(':RN-lib-demo').projectDir = new File(rootProject.projectDir, 	'../node_modules/RN-lib-demo/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':RN-lib-demo')
  	```


## Usage
```javascript
import RNLibDemo from 'RN-lib-demo';

// TODO: What to do with the module?
RNLibDemo;
```
  