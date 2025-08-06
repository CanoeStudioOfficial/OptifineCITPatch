package optifinecitpatch;

import net.minecraftforge.fml.common.Mod;

import optifinecitpatch.optifinecitpatch.Tags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Tags.MOD_ID,
        version = Tags.VERSION,
        name = Tags.MOD_NAME,
        dependencies = "required-after:mixinbooter",
        acceptableRemoteVersions = "*"
)
public class OptiFineCITPatch {
    public static final String MODID = Tags.MOD_ID;
    public static final String VERSION = Tags.VERSION;
    public static final String NAME = Tags.MOD_NAME;
    public static final Logger LOGGER = LogManager.getLogger();
}