/*
 * Copyright (C) 2016 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.isoron.androidbase.activities;

import android.content.*;

import org.isoron.uhabits.activities.*;
import org.isoron.uhabits.ui.*;

import dagger.*;

@Module
public class ActivityModule
{
    private BaseActivity activity;

    public ActivityModule(BaseActivity activity)
    {
        this.activity = activity;
    }

    @Provides
    public BaseActivity getActivity()
    {
        return activity;
    }

    @Provides
    @ActivityContext
    public Context getContext()
    {
        return activity;
    }

    @Provides
    @ActivityScope
    public static ThemeSwitcher getThemeSwitcher(AndroidThemeSwitcher t)
    {
        return t;
    }
}
