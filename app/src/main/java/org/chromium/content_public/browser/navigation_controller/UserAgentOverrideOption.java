
// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/public/browser/navigation_controller.h

package org.chromium.content_public.browser.navigation_controller;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    UserAgentOverrideOption.INHERIT, UserAgentOverrideOption.FALSE, UserAgentOverrideOption.TRUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface UserAgentOverrideOption {
  /**
   * Use the override value from the previous NavigationEntry in the NavigationController.
   */
  int INHERIT = 0;
  /**
   * Use the default user agent.
   */
  int FALSE = 1;
  /**
   * Use the user agent override, if it's available. Adding new UserAgentOverrideOption? Also update
   * LoadUrlParams.java static constants.
   */
  int TRUE = 2;
}
