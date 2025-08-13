An example mod for Necesse adapted for Kotlin.

## Notes about the Kotlin version

There are two ways to make the kotlin stdLib accessible at runtime:
- Use Kotlin Provider Mod by Sparky200 (available on Steam) as a mod dependency. That way you do not need to package the whole kotlin stdLib into every mod that uses Kotlin.
- Add the kotlin stdLib into your libDepends, so it gets packaged into your mod jar file. This doesn't force users to download additional mod dependencies but blows up your jar file a lot. The kotlin stdLib also comes with a META-INF/versions/9/module-info.class that should not be moved into the mod jar as it will crash Necesse's ModLoader.

The build.gradle file is currently set up to support the first variant, but you can switch by commenting out the mod dependency line and removing the comment around the line that adds the stdLib to libDepends 

Check out the [modding wiki page](https://necessewiki.com/Modding) for more.