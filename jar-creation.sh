# -c => directory to output the jar file
# -C => change to directory
# last argument => module root directory ( . in this case because of the previous -C
jar -c --file=lib/math.util@1.0.jar -C mods/math.util .
