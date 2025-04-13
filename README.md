## IntelliJ IDEA
This guide will show how to import the MultiLoader Template into IntelliJ IDEA. The setup process is roughly equivalent to setting up Forge and Fabric independently and should be very familiar to anyone who has worked with their MDKs.

1. Clone or download this repository to your computer.
2. Configure the project by editing the `group`, `mod_name`, `mod_author`, and `mod_id` properties in the `gradle.properties` file. You will also need to change the `rootProject.name`  property in `settings.gradle`, this should match the folder name of your project, or else IDEA may complain.
3. Open the template's root folder as a new project in IDEA. This is the folder that contains this README file and the gradlew executable.
4. If your default JVM/JDK is not Java 17 you will encounter an error when opening the project. This error is fixed by going to `File > Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JVM`and changing the value to a valid Java 17 JVM. You will also need to set the Project SDK to Java 17. This can be done by going to `File > Project Structure > Project SDK`. Once both have been set open the Gradle tab in IDEA and click the refresh button to reload the project.
5. Open the Gradle tab in IDEA if it has not already been opened. Navigate to `Your Project > Common > Tasks > vanilla gradle > decompile`. Run this task to decompile Minecraft.
6. Open the Gradle tab in IDEA if it has not already been opened. Navigate to `Your Project > Forge > Tasks > forgegradle runs > genIntellijRuns`. Run this task to set up run configurations for Forge.
7. Open your Run/Debug Configurations. Under the Application category there should now be options to run Forge and Fabric projects. Select one of the client options and try to run it.
8. Assuming you were able to run the game in step 7 your workspace should now be set up.

# Template Mod Name
[![Modrinth Downloads](https://img.shields.io/modrinth/dt/{template-mod-slug}?style=flat&logo=modrinth&label=Modrinth)](https://modrinth.com/mod/{template-mod-slug})
[![CurseForge Downloads](https://img.shields.io/curseforge/dt/{project-id}?style=flat&logo=curseforge&label=Curseforge)](https://www.curseforge.com/minecraft/mc-mods/{template-mod-slug})
![CurseForge Game Versions](https://cf.way2muchnoise.eu/versions/{project-id}.svg)

[![Oblivion](https://raw.githubusercontent.com/VoidLeech/Oblivion/1.20.1/forge/src/main/resources/icon.png)](https://github.com/VoidLeech/Oblivion)  
Requires Oblivion.

### F.A.Q.
**Q: Can this be used in my modpack?**  
**A:** Yes, but do note our license does not allow directly including the mod files in your pack.

### Licensing
This project is released under the [Avoiding Leeching License, version 1.1](LICENSE).

#### Third-Party Content
If any