// include(":MyFirstPlugin")

include("")

include(":POGlugin")
project(":POGlugin").projectDir = File("./POGlugin")

include(":lightshotroulette")
project(":lightshotroulette").projectDir = File("./lightshotroulette")


include(":someone")
project(":someone").projectDir= File("./someone")

include(":byebyeSlashCommands")
project(":byebyeSlashCommands").projectDir = File("./byebyeSlashCommands")

include(":betterSilentTyping")
project(":betterSilentTyping").projectDir = File("./betterSilentTyping")

include(":HighlightReplies")
project(":HighlightReplies").projectDir = File("./HighlightReplies")

rootProject.name = "AliucordPlugins"

