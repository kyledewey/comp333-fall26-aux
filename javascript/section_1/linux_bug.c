int* p = NULL;
...
int c = *p; // p != NULL
...
if (p != NULL) {
  access_granted();
} else {
  access_denied();
}
