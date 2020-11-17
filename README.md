# Navigation Component Sample

This is a simple Virus List application which allow user navigate from a simple Viruses list to see their details in a master-detail approach.

Application is built on Android's Navigation Component using concepts like:
* `NavGraph`
* `Navigation Controller`
* `SafeArgs`
* `Deepinks`

### Deeplink support
To test deeplinks, execute:

```
adb shell am start -a android.intent.action.VIEW -d "vncapp://vnc.app/viruses/details/000001" cl.svasquezm.virusnavcomponent
```

`000001` is the ID to use.