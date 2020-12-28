
// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../net/android/cellular_signal_strength.cc

package org.chromium.net;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    CellularSignalStrengthError.ERROR_NOT_SUPPORTED
})
@Retention(RetentionPolicy.SOURCE)
public @interface CellularSignalStrengthError {
  /**
   * Value returned by CellularSignalStrength APIs when a valid value is unavailable. This value is
   * same as INT32_MIN, but the following code uses the explicit value of INT32_MIN so that the
   * auto-generated Java enums work correctly.
   */
  int ERROR_NOT_SUPPORTED = -2147483648;
}
