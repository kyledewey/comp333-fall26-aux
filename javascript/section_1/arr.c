// FOR WEDNESDAY: array access in JS
#include "stdio.h"

// strong vs. weak typing:
//
// strong - no undefined behavior (fewer errors,
// errors are easier to debug); more predictable
//
// weak - more control; better runtime performance;
// less predictable

void print_element(int arr[], int index) {
  int element = arr[index];
  printf("%i\n", element);
}

int main() {
  int arr[3] = { 5, 7, 9 };
  print_element(arr, 2);
  print_element(arr, -1234562345);
  return 0;
}

