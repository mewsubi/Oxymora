@echo off
cd /d %~dp0
cd .
set unescaped=%~dp0
set escaped=%unescaped:\=\\%
dir /s /B *.class > sources.txt
powershell -Command "(gc sources.txt) -replace '%escaped%', '' | Out-File -encoding ASCII sources.txt"
jar cmf oxymora.mf ../Oxymora.jar plugin.yml @sources.txt
cd ..