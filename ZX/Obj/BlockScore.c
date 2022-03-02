/* Ofront+ 1.0 -mx3 -21 */
#include "SYSTEM.oh"
#include "AI.oh"
#include "Basic.oh"
#include "Laser2.oh"
#include "Rsrc.oh"
#include "NewSupercode.oh"




static void BlockScore_LevelMenu (void);
static void BlockScore_MainMenu (void);
static void BlockScore_ShowBall (CHAR x, CHAR y, CHAR color);
static void BlockScore_ShowBoard (void);


/*============================================================================*/

static void BlockScore_ShowBall (CHAR x, CHAR y, CHAR color)
{
  if (color != 0) {
    Laser2_PTBL(__ASHL(x, 1, SHORTINT), __ASHL(y, 1, SHORTINT), 1);
  }
  if (__ODD(x) == __ODD(y)) {
    Basic_COLOR(32 + color);
  } else {
    Basic_COLOR(40 + color);
  }
  Laser2_SETV(__ASHL(x, 1, SHORTINT), __ASHL(y, 1, SHORTINT), 2, 2);
}

static void BlockScore_ShowBoard (void)
{
  CHAR x, y;
  y = 0;
  while (y <= 11) {
    x = 0;
    while (x <= 15) {
      BlockScore_ShowBall(x, y, AI_Cell(x, y));
      x += 1;
    }
    y += 1;
  }
}

static void BlockScore_MainMenu (void)
{
  Basic_COLOR(57);
  Basic_CLS();
  Basic_BORDER(1);
  Basic_COLOR(79);
  NewSupercode_LITERY(4, 0, 2, 3, 7, (CHAR*)"Block & Score (TM)", 19);
  Basic_COLOR(57);
  NewSupercode_LITERY(35, 40, 2, 2, 8, (CHAR*)"New Game", 9);
  NewSupercode_LITERY(35, 70, 2, 2, 8, (CHAR*)"High Scores", 12);
  NewSupercode_LITERY(35, 100, 2, 2, 8, (CHAR*)"Credits", 8);
  NewSupercode_LITERY(35, 130, 2, 2, 8, (CHAR*)"About", 6);
  NewSupercode_LITERY(35, 160, 2, 2, 8, (CHAR*)"Exit", 5);
  Basic_PAUSE(0);
}

static void BlockScore_LevelMenu (void)
{
  Basic_COLOR(57);
  Basic_CLS();
  Basic_BORDER(1);
  Basic_COLOR(79);
  NewSupercode_LITERY(0, 0, 2, 3, 9, (CHAR*)"  Select Game  ", 16);
  Basic_COLOR(57);
  NewSupercode_LITERY(35, 45, 2, 2, 8, (CHAR*)"Beginner", 9);
  NewSupercode_LITERY(35, 80, 2, 2, 8, (CHAR*)"Intermediate", 13);
  NewSupercode_LITERY(35, 115, 2, 2, 8, (CHAR*)"Expert", 7);
  NewSupercode_LITERY(35, 150, 2, 2, 8, (CHAR*)"Demo", 5);
  Basic_PAUSE(0);
}


int main (int argc, char **argv)
{
  __INIT(argc, argv);
  __IMPORT(AI__init);
  __IMPORT(Rsrc__init);
  __IMPORT(Basic__init);
  __IMPORT(Laser2__init);
  __IMPORT(NewSupercode__init);
  __REGMAIN("BlockScore", 0);
/* BEGIN */
  Basic_Init();
  BlockScore_MainMenu();
  Laser2_SPRTa(Rsrc_Sprites, 37);
  Laser2_ATOF();
  Basic_RANDOMIZE(0);
  Basic_CLS();
  Basic_BORDER(0);
  AI_Init(2);
  if (AI_Bf(1)) {
  }
  for (;;) {
    BlockScore_ShowBoard();
    Basic_PAUSE(0);
    AI_A4(1);
    AI_Av();
  }
  Basic_Quit();
  __FINI;
}
