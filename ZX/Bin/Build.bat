@ECHO OFF
IF NOT "%XDev%"=="" GOTO XDev
ECHO Please set system variable XDev=X:\Path\To\XDev
PAUSE
EXIT

:XDev

SET MainMod=BlockScore
SET CodeAdr=25000
SET DataAdr=60000
SET Modules=AI.rel Rsrc.rel
SET Options=--reserve-regs-iy
SET Include=-I ..\Lib\C -I ..\Lib\Obj
SET Target=TAP

%XDev%\ZXDev\Bin\Build.bat %1
