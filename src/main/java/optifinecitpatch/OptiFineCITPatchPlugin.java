package optifinecitpatch;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import zone.rong.mixinbooter.IEarlyMixinLoader;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.12.2")
public class OptiFineCITPatchPlugin implements IFMLLoadingPlugin ,IEarlyMixinLoader {

	@Override
	public List<String> getMixinConfigs() {
		return Collections.singletonList("mixins.optifinecitpatch.early.json");
	}

	@Override
	public String[] getASMTransformerClass()
	{
		return new String[0];
	}

	@Override
	public String getModContainerClass()
	{
		return null;
	}

	@Override
	public String getSetupClass()
	{
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) { }

	@Override
	public String getAccessTransformerClass()
	{
		return null;
	}
}