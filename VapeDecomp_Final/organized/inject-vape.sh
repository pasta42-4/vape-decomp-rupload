#!/bin/bash

PID=$(jps -l | grep -i "minecraft\|prismlauncher" | awk '{print $1}')

if [ -z "$PID" ]; then
    echo "❌ Minecraft not running!"
    exit 1
fi

echo "🎯 Found Minecraft PID: $PID"
echo "💉 Injecting Vape..."

JAVA8=/home/link/.local/share/PrismLauncher/java/jre-legacy/bin/java
TOOLS=/home/link/.local/share/PrismLauncher/java/jre-legacy/lib/tools.jar

$JAVA8 -cp .:$TOOLS SimpleInject $PID vape-agent.jar

echo "✅ Done! Check Minecraft console for '[VapeAgent]' messages"
