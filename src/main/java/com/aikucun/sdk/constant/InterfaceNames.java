package com.aikucun.sdk.constant;

/**
 * Interface name constants used by {@code AikucunClient}.
 *
 * <p>Some constants may be kept here for backward compatibility. If you need a
 * clearer separation for deprecated/legacy API names, consider moving those
 * constants into {@link LegacyInterfaceNames} and keep this class as the set of
 * actively used interface names.
 */
public final class InterfaceNames {

    private InterfaceNames() {
    }

    /**
     * Test interface (restored).
     */
    public static final String TEST = "mengxiang.test";

    // ------------------------ After-sale ------------------------

    /**
     * After-sale: confirm order.
     *
     * <p>Required by {@code AikucunClient}.
     */
    public static final String AFTERSALE_CONFIRM_ORDER = "mengxiang.aftersale.confirm.order";

    /**
     * After-sale: save express info.
     */
    public static final String AFTERSALE_SAVE_EXPRESS_INFO = "mengxiang.aftersale.order.save.express.info";

    /**
     * After-sale: update express info.
     */
    public static final String AFTERSALE_UPDATE_EXPRESS_INFO = "mengxiang.aftersale.order.update.express.info";

}
