#include "stdio.h"

void print_element(int arr[], int index) {
  int element = arr[index];
  printf("%i\n", element);
}

int main() {
  int arr[3] = {4, 2, 7};
  print_element(arr, 3);
  return 0;
}
