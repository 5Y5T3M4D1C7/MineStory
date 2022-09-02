package com.system.minestory.scrolls;

import java.io.IOException;

import com.system.minestory.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiContainerScroll extends GuiContainer {
  private static final ResourceLocation ENCHANT_SCROLL = new ResourceLocation(Reference.MODID + ":textures/gui/enchant_scroll.png");
  
  private static MSItemEnchant scroll;
  
  public GuiContainerScroll(Container container) {
    super(container);
    scroll = (MSItemEnchant) container;
  }
  
  public void drawScreen(int mouseX, int mouseY, float partialTicks){
      this.drawDefaultBackground();
          this.drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
          super.drawScreen(mouseX, mouseY, partialTicks);
          this.renderHoveredToolTip(mouseX, mouseY);
  }
  
  protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
      this.fontRenderer.drawString(I18n.format("container.enchant_scroll"), 32, 6, 4210752);
  }
  
  protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(ENCHANT_SCROLL);
      int i = this.guiLeft;
      int j = (this.height - this.ySize) / 2;
      this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
  }
  
  protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException{
	  if((mouseX > 246 && mouseX < 284) && (mouseY > 62 && mouseY < 84)) {
		  scroll.levelUp();
	  }
      super.mouseClicked(mouseX, mouseY, mouseButton);
  }
}