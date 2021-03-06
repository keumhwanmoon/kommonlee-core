/**
 * This project is licensed under the Apache License, Version 2.0
 * if the following condition is met:
 * (otherwise it cannot be used by anyone but the author, Kevin, only)
 *
 * The original KommonLee project is owned by Lee, Seong Hyun (Kevin).
 *
 * -What does it mean to you?
 * Nothing, unless you want to take the ownership of
 * "the original project" (not yours or forked & modified one).
 * You are free to use it for both non-commercial and commercial projects
 * and free to modify it as the Apache License allows.
 *
 * -So why is this condition necessary?
 * It is only to protect the original project (See the case of Java).
 *
 *
 * Copyright 2009 Lee, Seong Hyun (Kevin)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.elixirian.kommonlee.functional;

import static org.elixirian.kommonlee.util.Objects.*;

import java.util.Comparator;

import org.elixirian.kommonlee.functional.string.NotEmptyStringCondition;
import org.elixirian.kommonlee.functional.string.PrefixAndSuffixAdder;
import org.elixirian.kommonlee.functional.string.StringArrayToTrimmedStringListSelector;
import org.elixirian.kommonlee.functional.string.StringArrayTrimmer;
import org.elixirian.kommonlee.functional.string.ToLowerCaseConverter;
import org.elixirian.kommonlee.type.functional.Function1;
import org.elixirian.kommonlee.util.CommonConstants;
import org.elixirian.kommonlee.util.string.IterableToStringGlue;
import org.elixirian.kommonlee.util.string.ToStringGlues;

/**
 * <pre>
 *     ___  _____                                              _____
 *    /   \/    / ______ __________________  ______ __ ______ /    /   ______  ______  
 *   /        / _/ __  // /  /   / /  /   /_/ __  // //     //    /   /  ___ \/  ___ \ 
 *  /        \ /  /_/ _/  _  _  /  _  _  //  /_/ _/   __   //    /___/  _____/  _____/
 * /____/\____\/_____//__//_//_/__//_//_/ /_____//___/ /__//________/\_____/ \_____/
 * </pre>
 * 
 * <pre>
 *     ___  _____                                _____
 *    /   \/    /_________  ___ ____ __ ______  /    /   ______  ______
 *   /        / /  ___ \  \/  //___// //     / /    /   /  ___ \/  ___ \
 *  /        \ /  _____/\    //   //   __   / /    /___/  _____/  _____/
 * /____/\____\\_____/   \__//___//___/ /__/ /________/\_____/ \_____/
 * </pre>
 * 
 * @author Lee, SeongHyun (Kevin)
 * @version 0.0.1 (2011-02-26)
 */
public final class Functions
{
  public static final Function1<?, ?> IDENTITY_FUNCTION = new Function1<Object, Object>() {
    @Override
    public Object apply(final Object input)
    {
      return input;
    }
  };

  public static final StringArrayToTrimmedStringListSelector STRING_ARRAY_TO_LIST_TRIM_SELECTOR =
    new StringArrayToTrimmedStringListSelector();

  private static final NotNullCondition<Object> NOT_NULL_CONDITION = new NotNullCondition<Object>();

  private static final NotEmptyStringCondition NOT_EMPTY_STRING_CONDITION = new NotEmptyStringCondition();

  private static final StringArrayTrimmer STRING_ARRAY_TRIMMER = new StringArrayTrimmer();

  private static final ToLowerCaseConverter TO_LOWER_CASE_CONVERTER = new ToLowerCaseConverter();

  public static final IterableToStringGlue<Object> ITERABLE_TO_CSV_GLUE = ToStringGlues.builderForIterable()
      .ignoreNull()
      .ignore("")
      .withSeparator(",")
      .build();

  public static final Comparator<Integer> INTEGER_ASCENDING_ORDER = new Comparator<Integer>() {
    @Override
    public int compare(final Integer i1, final Integer i2)
    {
      mustNotBeNull(i1);
      mustNotBeNull(i2);
      return i1.compareTo(i2);
    }
  };

  private Functions() throws IllegalAccessException
  {
    throw new IllegalAccessException(getClass().getName() + CommonConstants.CANNOT_BE_INSTANTIATED);
  }

  public static <T> NotNullCondition<T> notNullCondition()
  {
    @SuppressWarnings("unchecked")
    final NotNullCondition<T> notNullCondition = (NotNullCondition<T>) NOT_NULL_CONDITION;
    return notNullCondition;
  }

  public static NotEmptyStringCondition notEmptyStringCondition()
  {
    return NOT_EMPTY_STRING_CONDITION;
  }

  public static StringArrayToTrimmedStringListSelector stringArrayToTrimmedStringListSelector()
  {
    return STRING_ARRAY_TO_LIST_TRIM_SELECTOR;
  }

  public static StringArrayTrimmer stringArrayTrimmer()
  {
    return STRING_ARRAY_TRIMMER;
  }

  public static PrefixAndSuffixAdder newPrefixAndSuffixAdder(final String prefix, final String suffix)
  {
    return new PrefixAndSuffixAdder(prefix, suffix);
  }

  public static ToLowerCaseConverter toLowerCaseConverter()
  {
    return TO_LOWER_CASE_CONVERTER;
  }

  public static <T> Function1<T, T> identityFunction()
  {
    @SuppressWarnings("unchecked")
    final Function1<T, T> identityFunction = (Function1<T, T>) IDENTITY_FUNCTION;
    return identityFunction;
  }

  public static <T> T identity(final T input)
  {
    return Functions.<T> identityFunction()
        .apply(input);
  }
}
