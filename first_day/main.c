// C: 1972
// Java: 1995

#include "stdio.h"

int main() {
  // C: undefined behavior
  int x = 0;
  x = x++ + x++;

  printf("%i\n", x);
  
  return 0;
}
