
#import "RNCloseApp.h"

@implementation RNCloseApp

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(close)
{
    exit(0);
}

@end
  